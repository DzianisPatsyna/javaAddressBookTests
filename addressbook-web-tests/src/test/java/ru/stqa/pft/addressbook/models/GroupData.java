package ru.stqa.pft.addressbook.models;

public class GroupData {
    private int id;
    private final String name;
    private final String footer;
    private final String header;

    public GroupData(String name, String footer, String header) {
        this.id = 0;
        this.name = name;
        this.footer = footer;
        this.header = header;
    }

    public GroupData(int id, String name, String footer, String header) {
        this.id = id;
        this.name = name;
        this.footer = footer;
        this.header = header;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getFooter() {
        return footer;
    }

    public String getHeader() {
        return header;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GroupData{" +

                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        if (id != groupData.id) return false;
        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }
}
