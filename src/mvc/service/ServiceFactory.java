package mvc.service;

import mvc.service.impl.StudentService;
import mvc.utils.enum_demo.ServiceEnum;

public class ServiceFactory {
    private ServiceFactory() {
    }

    public static IPersonService getInstance(ServiceEnum serviceEnum) {
        switch (serviceEnum) {
            case STUDENT:
                return StudentService.getInstance();
            case TEACHER:
                return null;
        }
        return null;
    }
}
