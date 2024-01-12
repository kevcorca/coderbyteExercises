fun CodelandUsernameValidation(str: String): String {

    // code goes here

    var countUsername = str.length
    var startUsername = true
    var firstLetterUsername = str[0]
    val pattern = "^[a-zA-Z0-9_]*$".toRegex()
    var regexUsername = true
    var lastLetterUsername = true
    var conditionUsername = ""


    if(firstLetterUsername.isLetter()){
        startUsername = true;
    }else {
        startUsername = false;
    }

    if(str.matches(pattern)){
        regexUsername = true
    }else {
        regexUsername = false
    }

    if(!str.endsWith("_")){
        lastLetterUsername = true
    }else {
        lastLetterUsername = false
    }

    if((countUsername >= 4 && countUsername <= 25) && startUsername && regexUsername && lastLetterUsername){
        conditionUsername = "true"
    }else {
        conditionUsername = "false"
    }
    return conditionUsername
}

fun main() {
    println(CodelandUsernameValidation(readLine().toString()))
}