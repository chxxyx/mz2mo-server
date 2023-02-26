package com.EmoHipHop.mz2mo.domain.emoji.util;

import com.EmoHipHop.mz2mo.domain.emoji.data.dto.EmojiDto;
import com.EmoHipHop.mz2mo.domain.emoji.data.response.EmojiListResponse;
import com.EmoHipHop.mz2mo.global.emoji.data.entity.Emoji;

import java.util.List;

public interface EmojiConverter {
    EmojiListResponse toResponse(List<EmojiDto> emojis);

    EmojiDto toDto(Emoji entity);
}