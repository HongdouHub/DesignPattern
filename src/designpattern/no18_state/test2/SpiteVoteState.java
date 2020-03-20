package designpattern.no18_state.test2;

public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager manager) {
        String oldVoteItem = manager.getMapVote().get(userName);
        if (oldVoteItem != null) {
            manager.getMapVote().remove(userName);
        }
        System.out.println("恶意刷票");
    }
}
