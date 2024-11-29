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
    private ExpeditionMember expeditionLeader;
    private ExpeditionMember archivist;
    private ExpeditionMember fieldResearcher;

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
    public static void main(String[] args) {
        String[] allNames = {"Liam", "John", "Jack", "Tom", "Jeff", "Eric"};
        int[] allStudentIDs = {0, 1, 2, 3, 4, 5};
        Random rand = new Random();
        ExpeditionMember[] members = new ExpeditionMember[rand.nextInt(3)+4];
        for(int i = 0; i < members.length ; i++) {
               members[i] = new ExpeditionMember();
               members[i].set_name(allNames[i]);
               members[i].set_id(allStudentIDs[i]);
        }

        ResearchExpedition pyramidExpedition = new ResearchExpedition(members[0], members[1], members[2]);
        ResearchExpedition nileExpedition = new ResearchExpedition(members[members.length-3], members[members.length-2], members[members.length-1]);

        System.out.println(pyramidExpedition.getExpeditionLeaderName());
        System.out.println(pyramidExpedition.getArchivistName());
        System.out.println(pyramidExpedition.getFieldResearcherName());
        System.out.println(nileExpedition.getExpeditionLeaderName());
        System.out.println(nileExpedition.getArchivistName());
        System.out.println(nileExpedition.getFieldResearcherName());

        if (members.length == ExpeditionMember.member_counter) {
            System.out.println("SUCCESS");
        }

        

    }
}
