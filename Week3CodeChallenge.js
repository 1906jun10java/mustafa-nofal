window.onload = function(){
    document.getElementById("ron").onclick = function() {
        sendAjaxGet('http://ron-swanson-quotes.herokuapp.com/v2/quotes', showRon);
    };
}

function sendAjaxGet(url, func) {
    
    let xhr = new XMLHttpRequest() || new ActiveXObject("Microsoft.HTTPRequest");
    
    xhr.onreadystatechange = function() {
        
        if (this.readyState == 4 && this.status == 200) {
            func(this);
        }
    }

    xhr.open("GET", url, true);
   
    xhr.send(); 
}

function showRon(xhr) {
    let ronObj = JSON.parse(xhr.responseText);
    console.log(ronObj);
    document.getElementById("temperature").innerText = "Quotes: "+ronObj;
    document.getElementById("description").innerText = ronObj.ron[0].description;
}