package ag_stuct;

public class TestBean {
    private int flag ;

    public TestBean(int flag) {
        this.flag = flag;
    }

    public TestBean() {
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "flag=" + flag +
                '}';
    }
}
