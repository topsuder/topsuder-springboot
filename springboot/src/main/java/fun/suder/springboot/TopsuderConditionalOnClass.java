package fun.suder.springboot;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-20:14
 * @Description
 * @see fun.suder.springboot topsuder-springboot
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(TopsuderOnClassCondition.class)
public @interface TopsuderConditionalOnClass {

    String value() default "";

}
