layui.config({
    base: 'jui/static/js/lib/'
}).use(['jparticle', 'form'], function () {
    window.jQuery = window.$ = layui.jquery;
    var canvas = $('.jui-canvas');
    canvas.width($(window).width());
    canvas.height($(window).height());
    layui.jparticle(canvas, {
        background: '#141414',
        color: '#E6E6E6'
    });
});