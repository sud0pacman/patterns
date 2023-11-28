package anonymous;

class StringBuilder {
    String str = "";

    StringBuilder() {}

    StringBuilder(String str) {
        this.str = str;
    }

    StringBuilder append(String addStr) {
        str += addStr;

        return this;
    }

    int length() {
        return str.length();
    }

    @Override
    public String toString() {
        return str;
    }
}

class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("hi ").append("anonymous ").append("pattern").length());

        System.out.println(sb);
    }
}