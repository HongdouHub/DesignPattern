package designpattern.no18_state.test2;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

    private Map<String, String> mapVote;        // 记录用户投票的结果，对应<用户名称， 投票的选项>
    private Map<String, Integer> mapVoteCount;  // 记录用户投票的次数，对应<用户名称， 投票的次数>
    private VoteState state; // 持有状态处理对象

    public VoteManager() {
        mapVote = new HashMap<String, String>();
        mapVoteCount = new HashMap<String, Integer>();
    }

    public void vote(String userName, String voteItem) {
        int count = addVoteCount(userName);
        if (count <= 1) {
            state = new NormalVoteState();
        } else if (count < 5) {
            state = new RepeatVoteState();
        } else if (count < 8) {
            state = new SpiteVoteState();
        } else {
            state = new BlackVoteState();
        }
        state.vote(userName, voteItem, this);
    }

    private int addVoteCount(String userName) {
        Integer oldVoteCount = mapVoteCount.get(userName);
        int currentCount = oldVoteCount == null ? 1 : oldVoteCount + 1;
        mapVoteCount.put(userName, currentCount);
        return currentCount;
    }

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }
}
