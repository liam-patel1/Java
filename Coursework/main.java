import java.util.Random;

class ExpeditionMember {
    private String name;
    private int id;
    public static int member_counter;

    ExpeditionMember() {
        member_counter += 1;
    }

    String get_name() {
        return name;
    }
    int get_id() {
        return id;
    }
    void set_name(String new_name) {
        name = new_name;
    }

    void set_id(int new_id) {
        id = new_id;
    }
}

class ResearchExpedition {
    ExpeditionMember expeditionLeader;
    ExpeditionMember archivist;
    ExpeditionMember fieldResearcher;

    ResearchExpedition(ExpeditionMember newexpeditionLeader, ExpeditionMember newarchivist, ExpeditionMember newfieldResearcher) {
        expeditionLeader = newexpeditionLeader;
        archivist = newarchivist;
        fieldResearcher = newfieldResearcher;
    }

    String getExpeditionLeaderName() {
        return expeditionLeader.get_name();
    }
    String getArchivistName() {
        return archivist.get_name();
    }
    String getFieldResearcherName() {
        return fieldResearcher.get_name();
    }
}




class Main {
    void main() {
        String[] allNames = {"Liam", "John", "Jack", "Tom", "Jeff", "Eric"};
        int[] allStudentIDs = {0, 1, 2, 3, 4, 5};
        Random rand = new Random();
        ExpeditionMember[] members = new ExpeditionMember[rand.nextInt(3)+4];
        System.out.println(members.length);
        

    }
}
