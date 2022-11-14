function eliminar(id,empresa){
	swal({
  title: "Esta seguro de eliminar?",
  text: "Seguro de eliminar la empresa "+empresa,
  icon: "error",
  buttons: true,
  dangerMode: true,
})
.then((ok) => {
  if (ok) {
	  $.ajax({
		  url:"/empresa/delete/"+id,
		  success: function(res){
			  console.log("eliminado");
			  
		  }
	  })
    swal("Eliminación exitosa", {
      icon: "success",
    }).then((oka)=>{
		location.href="/empresa/list";
	});
  } else {
    swal("Eliminación Cancelada");
  }
});
}