package prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent copy = new IntelligentStudent();
//        copy.setName(this.getName());
//        copy.setAge(this.getAge());
//        copy.setPsp(this.getPsp());
//        copy.setBatchName(this.getBatchName());
//        copy.setAvgBatchPsp(this.getAvgBatchPsp());
//        copy.iq = this.iq;
//
//        return copy;

        // Use the copy constructor to create a new instance
        return new IntelligentStudent(this);
    }

    // Getters and Setters
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
