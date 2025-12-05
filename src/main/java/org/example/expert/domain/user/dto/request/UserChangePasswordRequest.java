package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;
    @NotBlank
    // // LV.2 - 코드 개선 - 3
    // DTO에 Validation 처리
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$",
            message = "새 비밀번호는 8자 이상이며 숫자와 대문자를 포함해야 합니다."
    )
    private String newPassword;
}
