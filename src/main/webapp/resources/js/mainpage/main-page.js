/**
 * Created by maguirre on 20-08-14.
 */

var menuTienda = $('#menuDinamico');
var fila = '';

$(document).ready(function(){

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
                                /*.html($('<div id="collapseChild_' + level1 + '" class="panel-collapse collapse"></div>')
                                    .html(function () {
                                            $.each(data.subMenuVOList, function () {
                                                $('<div class="panel-body"></div>').html(this.submenu);
                                            });
                                        }
                                )
                            )*/
                        )
                    )
                )
                .append($('<div id="collapseChild_' + level1 + '" class="panel-collapse collapse"></div>')
                    .html(function () {
                            $.each(this.subMenuVOList,
                                function () {
                                    $('<div class="panel-body"></div>').html(this.submenu);
                                });
                            }
                    )
                )
            );
            level1 = level1 + 1;
        });

        menuTienda.html(fila);

    });

});