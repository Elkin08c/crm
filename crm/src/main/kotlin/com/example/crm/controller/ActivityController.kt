import com.example.crm.dto.ActivityDto
import com.example.crm.services.ActivityService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/activity")
class ActivityController {

    @Autowired
    lateinit var activityService: ActivityService

    @GetMapping
    fun getActivities() = activityService.getActivities()

    @PostMapping
    fun save(@RequestBody @Valid activityDto: ActivityDto) = activityService.save(activityDto)
}
