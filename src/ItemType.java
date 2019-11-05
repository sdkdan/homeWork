public enum ItemType {
     Audio("AU"),
     Visual("VI"),
     AudioMobile("AM"),
     VisualMobile("VM");

     private String type;
     ItemType(String type) {
        this.type = type;
     }
}
