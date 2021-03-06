/**
 * Created by maguirre on 20-08-14.
 */

var menuTienda = $('#menuDinamico');
var fila = '';

$(document).ready(function(){

    var subMenuDrawer = function (subMenuVOList) {
        var subFila = $('<div></div>');
        $.each(subMenuVOList,
            function () {
                subFila.append($('<div class="panel-body"></div>').html(this.submenu));
            }
        );
        return subFila;
    };

    $.post('get-menu', '', function(data){
        var level1 = 0;
        fila = $('<div></div>');
        $.each(data.menuVOList, function (){
            /**Menu*/
            fila.append($('<div class="panel panel-default"></div>')
                .html($('<div class="panel-heading"></div>')
                    .html($('<h4 class="panel-title"></h4>')
                        .html($('<a data-toggle="collapse" data-parent="#accordionChild" href="#collapseChild_' + level1 + '"></a>"')
                            .html(this.nombreMenu)
                        )
                    )
                )
            );


            fila.append($('<div id="collapseChild_' + level1 + '" class="panel-collapse collapse"></div>')
                    .html($(subMenuDrawer(this.subMenuVOList)))
            );

            level1 = level1 + 1;
        });

        menuTienda.html(fila);

    });

});