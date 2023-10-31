package com.InterviewTracker.Tracker;





import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.InterviewTracker.Tracker.entity.Interview;
import com.InterviewTracker.Tracker.repository.InterviewRepository;
import com.InterviewTracker.Tracker.service.InterviewService;

 

@SpringBootTest

class TrackerApplicationTests {
	
//	@Mock
//    private InterviewRepository interviewRepository;
//
//    @InjectMocks
//    private InterviewService interviewService;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
// 
//	   Interview interview1 = new Interview();
//       Interview interview2 = new Interview();
//       List<Interview> interviews = Arrays.asList(interview1, interview2);
//
//       // Mock the behavior of the interviewRepository
//       when(interviewRepository.findAll()).thenReturn(interviews);
//
//       // Call the service method
//       List<Interview> result = interviewService.getAllInterviews();
//
//       // Assertions
//       assertEquals(2, result.size());
//       assertEquals(interview1, result.get(0));
//       assertEquals(interview2, result.get(1));
//       verify(interviewRepository, times(1)).findAll();
//   }
//
//   // Modify other test cases in a similar manner
//
//   @Test
//   public void testCreateInterview() {
//       Interview interview = new Interview();
//       when(interviewRepository.save(interview)).thenReturn(interview);
//
//       Interview createdInterview = interviewService.createInterview(interview);
//
//       assertEquals(interview, createdInterview);
//       verify(interviewRepository, times(1)).save(interview);
//   }
//
//   @Test
//   public void testFindByEmail() {
//       String email = "suyash-govinda.a.pingale@capgemini.com";
//       Interview interview1 = new Interview();
//       interview1.setEmail(email);
//       Interview interview2 = new Interview();
//       interview2.setEmail(email);
//       List<Interview> interviews = Arrays.asList(interview1, interview2);
//
//       when(interviewRepository.findByEmail(email)).thenReturn(interviews);
//
//       List<Interview> result = interviewService.findInterviewsByEmail(email);
//
//       assertEquals(2, result.size());
//       verify(InterviewRepository, times(1)).findByEmail(email);
//   }
// 
////
////    @Test
////
////    public void testDeleteInterviewById() {
////
////        Long interviewId = 1L;
////
//// 
////
////        interviewService.deleteInterviewById(interviewId);
////
//// 
////
////        verify(interviewRepository, times(1)).deleteById(interviewId);
////
////    }
//
// 
//
//    @Test
//
//    public void testFindByEmail() {
//
//        String email = "suyash-govinda.a.pingale@capgemini.com";
//
//        Interview interview1 = new Interview();
//
//        interview1.setEmail(email);
//
//        Interview interview2 = new Interview();
//
//        interview2.setEmail(email);
//
//        List<Interview> interviews = Arrays.asList(interview1, interview2);
//
// 
//
//        when(interviewRepository.findByEmail(email)).thenReturn(interviews);
//
// 
//
//        List<Interview> result = interviewService.findInterviewsByEmail(email);
//
// 
//
//        assertEquals(1, result.size());
//
//        verify(interviewRepository, times(1)).findByEmail(email);
//
//    }
//
// 
//
//    @Test
//
//    public void testFindByMentorName() {
//
//        String mentorName = "Samrudhhi";
//
//        Interview interview1 = new Interview();
//
//        interview1.setMentorName(mentorName);
//
//        Interview interview2 = new Interview();
//
//        interview2.setMentorName(mentorName);
//
//        List<Interview> interviews = Arrays.asList(interview1, interview2);
//
// 
//
//        when(interviewRepository.findByMentorName(mentorName)).thenReturn(interviews);
//
// 
//
//        List<Interview> result = interviewService.findInterviewsByMentorName(mentorName);
//
// 
//
//        assertEquals(2, result.size());
//
//        verify(interviewRepository, times(1)).findByMentorName(mentorName);
//
//    }
//
// 
//
//    @Test
//
//    public void testFindByEmployeeName() {
//
//        String employeeName = "Suyash Pingale";
//
//        Interview interview1 = new Interview();
//
//        interview1.setEmployeeName(employeeName);
//
//        Interview interview2 = new Interview();
//
//        interview2.setEmployeeName(employeeName);
//
//        List<Interview> interviews = Arrays.asList(interview1, interview2);
//
// 
//
//        when(interviewRepository.findByEmployeeName(employeeName)).thenReturn(interviews);
//
// 
//
//        List<Interview> result = interviewService.findInterviewsByEmployeeName(employeeName);
//
// 
//
//        assertEquals(2, result.size());
//
//        verify(interviewRepository, times(1)).findByEmployeeName(employeeName);
//
//    }
//
// 
//
//    @Test
//
//    public void testFindInterviewsByEmpId() {
//
//        Integer empId = 46329995;
//
//        Interview interview1 = new Interview();
//
//        interview1.setEmpId(empId);
//
//        Interview interview2 = new Interview();
//
//        interview2.setEmpId(empId);
//
//        List<Interview> interviews = Arrays.asList(interview1, interview2);
//
// 
//
//        when(interviewRepository.findByEmpId(empId)).thenReturn(interviews);
//
// 
//
//        List<Interview> result = interviewService.findInterviewsByEmpId(empId);
//
// 
//
//        assertEquals(2, result.size());
//
//        verify(interviewRepository, times(1)).findByEmpId(empId);
//
//    }
//
// 

    

    // Add more test methods as needed

 

    

}

