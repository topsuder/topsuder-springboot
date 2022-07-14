package fun.suder.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Map;

/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/7/14-20:15
 * @Description
 * @see fun.suder.springboot topsuder-springboot
 */
public class TopsuderOnClassCondition implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  the condition context
     * @param metadata the metadata of the {@link AnnotationMetadata class}
     *                 or {@link MethodMetadata method} being checked
     * @return {@code true} if the condition matches and the component can be registered,
     * or {@code false} to veto the annotated component's registration
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        final Map<String, Object> allAnnotationAttributes
                = metadata.getAnnotationAttributes(TopsuderConditionalOnClass.class.getName());

        assert allAnnotationAttributes != null;
        String className = (String) allAnnotationAttributes.get("value");

        try {
            context.getClassLoader().loadClass(className);
        } catch (ClassNotFoundException e) {
            return false;
        }

        return true;
    }
}
