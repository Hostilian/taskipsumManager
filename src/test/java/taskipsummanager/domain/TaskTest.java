package taskipsummanager.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static taskipsummanager.domain.TaskTestSamples.*;

import org.junit.jupiter.api.Test;
import taskipsummanager.web.rest.TestUtil;

class TaskTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Task.class);
        Task task1 = getTaskSample1();
        Task task2 = new Task();
        assertThat(task1).isNotEqualTo(task2);

        task2.setId(task1.getId());
        assertThat(task1).isEqualTo(task2);

        task2 = getTaskSample2();
        assertThat(task1).isNotEqualTo(task2);
    }
}
