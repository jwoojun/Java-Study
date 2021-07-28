package com.example.ttd.study;


import com.example.ttd.Study;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberService extends JpaRepository<Member, Long> {
    Optional<Member> findById(Long memberId);

    void validate(Long memberId);

    void notify(Study newStudy);

    void notify(Member member);
}
