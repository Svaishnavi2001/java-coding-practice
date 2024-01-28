package info.student;

public class Address {
        int flatNo;
        int pinCode;
        int street;
        String state;
        String country;

        public Address(int flatNo,int pinCode) {
                this.flatNo = flatNo;
                this.pinCode = pinCode;
        }
        public int getFlatNo(){
                return flatNo;
        }
        public void setFlatNo(int flatNo){
                this.flatNo=flatNo;
        }
        public int getPinCode(){
                return pinCode;
        }
        public void setPinCode(int pinCode){
                this.pinCode=pinCode;
        }
}




