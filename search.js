    
	var kv; var username; var found; var repairstatus;

    function validate(form) {
	
	document.getElementById('td_isfound').innerHTML = "";
    document.getElementById('td_device').innerHTML = "";
    document.getElementById('td_status').innerHTML = "";

    var kv_ui = document.getElementById('kv').value;
    var username_ui  = document.getElementById('username').value;

    if ((kv_ui > 1) &&(kv_ui<9999) && (username_ui.length>2)  && (username_ui.length<20)) 
				{
				
				fetch('/search',{method: 'POST',
							headers : {'Content-type':'application/json'},
							body:JSON.stringify({kv:document.getElementById('kv').value, username:document.getElementById('username').value})})
				.then((response) => response.json())
				.then((responseData) => {
				console.log(responseData);
				
				kv= responseData.kv;
				found = responseData.found;
				repairstatus = responseData.repairstatus;

			  if (responseData.found == 1)
			  {
					document.getElementById('td_isfound').innerHTML = "Найдено:";
					document.getElementById('td_device').innerHTML = responseData.device + "  ";
					document.getElementById('td_status').innerHTML = responseData.repairstatus;
				}
			  else if (responseData.found == 0)
			  {
					document.getElementById('td_isfound').innerHTML = "Ничего не найдено";
			  }
			return responseData;
			});


			}


			else
			{
			document.getElementById('td_isfound').innerHTML = "Проверьте правильность ввода";
			} 
}

