package me.fabxoe.inflearnthejavatest;

public class Study {

//    private StudyStatus status = StudyStatus.DRAFT;
    private StudyStatus status;

    private String name;

    public Study(int limit, String name) {
        this.name = name;
        this.limit = limit;
    }

    public Study(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("limit은 0보다 커야 한다.");
        }
        this.limit = limit;
    }

    private int limit;

    public StudyStatus getStatus() {
        return status;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Study{" +
                "status=" + status +
                ", name='" + name + '\'' +
                ", limit=" + limit +
                '}';
    }


}
