package com.EmoHipHop.mz2mo.domain.vote.service;

import com.EmoHipHop.mz2mo.domain.vote.data.dto.AddVoteDto;
import com.EmoHipHop.mz2mo.domain.vote.data.dto.VoteDto;

public interface VoteService {
    VoteDto addEmojiVote(AddVoteDto dto);
}