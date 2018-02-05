$(document).ready(function() {
    $('#search').click(function(){
        var isValid = true;
        if($('#searchPromo').val() == "") {
            var search = document.getElementById("searchPromo");
            search.placeholder = "Required Field";
            search.style.border = '2px solid #da1404';
            isValid = false;
        }
        if(isValid) {
            document.forms['searchForm'].submit()
        }
    });

    $("#promoStartDt").keyup(function(e){
        if (e.keyCode != 8){
            if ($(this).val().length == 2){
                $(this).val($(this).val() + "/");
            }else if ($(this).val().length == 5){
                $(this).val($(this).val() + "/");
            }
        }
    });

    $("#promoEndDt").keyup(function(e){
        if (e.keyCode != 8){
            if ($(this).val().length == 2){
                $(this).val($(this).val() + "/");
            }else if ($(this).val().length == 5){
                $(this).val($(this).val() + "/");
            }
        }
    });

    $(".code").keyup(function (e) {
        if($(this).val().length > 0) {
            clearError();
            $(".nmdesc").prop('disabled', true);
            $(".dt").prop('disabled', true);
        } else {
            $(".nmdesc").prop('disabled', false);
            $(".dt").prop('disabled', false);
        }
    })

    $(".nmdesc").keyup(function () {
        var isAllEmpty = true;
        $(".nmdesc").each(function () {
            if($(this).val().length > 0) {
                isAllEmpty = false;
                clearError();
                $(".code").prop('disabled', true);
                $(".dt").prop('disabled', true);
            }
        })
        if(isAllEmpty) {
            $(".code").prop('disabled', false);
            $(".dt").prop('disabled', false);
        }
    })



    $(".dt").keyup(function () {
        var isAllEmpty = true;
        $(".dt").each(function () {
            if($(this).val().length > 0) {
                isAllEmpty = false;
                clearError();
                $(".code").prop('disabled', true);
                $(".nmdesc").prop('disabled', true);
            }
        })
        if(isAllEmpty) {
            $(".code").prop('disabled', false);
            $(".nmdesc").prop('disabled', false);
        }
    })
    
    $("#searchPromo").click(function () {
        var isValid = true;
        $('.code').each(function (i) {
            if(!$(this).prop('disabled') && this.value == "") {
                this.placeholder = "Required field";
                this.style.border = '2px solid #da1404';
                isValid = false;
            }
        })
        $('.nmdesc').each(function (i) {
            if(!$(this).prop('disabled') && this.value == "") {
                this.placeholder = "Required field";
                this.style.border = '2px solid #da1404';
                isValid = false;
            }
        })
        $('.dt').each(function (i) {
            if(!$(this).prop('disabled') && (this.value == "" || !validateField(this.id, this.value))) {
                this.placeholder = "Required field";
                this.style.border = '2px solid #da1404';
                isValid = false;
            }
        })
        if(isValid) {
            document.forms['searchForm'].submit()
        }
    })

    function clearError() {
        $('input[type="text"]').each(function (i) {
            this.placeholder = "Search here...";
            this.style.border = '';
        })
    }

    function validateField(name, value) {
        if(name == "promoStartDt" || name == "promoEndDt") {
            return moment(value, 'MM/DD/YYYY',true).isValid()
        }
        return true;
    }
});