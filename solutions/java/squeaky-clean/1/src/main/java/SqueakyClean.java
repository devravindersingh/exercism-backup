class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] chArray = identifier.toCharArray();
        boolean isNextCamel = false;
        for(char c: chArray){
            if(Character.isWhitespace(c)){
                c = '_';
                builder.append(c);
            }
            else if( c == '-'){
                isNextCamel = true;
            }
            else if(Character.isDigit(c)){
                switch(c){
                    case '4': c = 'a';
                        break;
                    case '3': c = 'e';
                        break;
                    case '0': c = 'o';
                        break;
                    case '1': c = 'l';
                        break;
                    case '7': c = 't';
                        break;
                }
                builder.append(c);
            }
            else if (Character.isLetter(c)){
                if(isNextCamel){
                    c = Character.toUpperCase(c);
                    isNextCamel = false;
                }
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
