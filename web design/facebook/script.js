$(document).ready(function(){
    $("#signup-form").validate({
        rules:{
            fname:{
                required:true,
                minlength:4,
                maxlength:6
            },

            lname:{
                required:true,
                minlength:4
            },
            email:{
                required:true,
                email:true
            },
            password:{
                required:true,
                minlength:6

            },
            day:{
             required:true,

            },
            gender:{
                required:true,
            }
        },
        messages:{
            fname:{
                required:"enter first name",
                minlength:"enter 4 char"
            }
            
        }
    })

})