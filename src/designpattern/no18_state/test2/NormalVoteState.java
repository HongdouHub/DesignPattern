package designpattern.no18_state.test2;

public class NormalVoteState implements VoteState {
    @Override
    public void vote(String userName, String voteItem, VoteManager manager) {
        manager.getMapVote().put(userName, voteItem);
        System.out.println("投票成功");
    }
}
