public String intOrString(Object var) {

        if (var instanceof String) {
            return "str";
        } else {
            return "int";
        }
    }