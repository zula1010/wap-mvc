$(function(){
    $('#add').click(addProduct);

    function addProduct(){
        var productId = $('#add').val();
        var product = {productId:productId};
        $.post('product',{product: JSON.stringify(product)}, processData, "json")
    }

    function processData(data){
        //data = JSON.parse(data);
        var td0=$('<td>').text(data.id);
        var td1 = $('<td>').text(data.name);
        var td2 = $('<td>').text(data.price);
        var tr = $('<tr>').append(td0).append(td1).append(td2);
        $('#tbl_products>tbody').append(tr);
    }
})
