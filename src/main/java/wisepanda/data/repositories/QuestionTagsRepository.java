package wisepanda.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wisepanda.data.entities.question.QuestionTags;

import java.util.List;
import java.util.Optional;

public interface QuestionTagsRepository extends JpaRepository<QuestionTags, Long> {
    @Query(value="SELECT qt.question.id FROM QuestionTags qt WHERE qt.topicTag.id IN :topicTagIds GROUP BY qt.question.id")
    List<Long> findByTopicId(List<Long> topicTagIds);

    @Query(value="FROM QuestionTags qt WHERE qt.question.id = ?1 AND qt.topicTag.id = ?2")
    Optional<QuestionTags> findByQuesAndTag(Long questionId, Long topicTagId);
}