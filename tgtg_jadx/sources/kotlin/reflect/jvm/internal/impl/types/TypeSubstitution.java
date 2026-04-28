package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final TypeSubstitution EMPTY = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: get, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ TypeProjection mo982get(KotlinType kotlinType) {
            return (TypeProjection) get(kotlinType);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        public boolean isEmpty() {
            return true;
        }

        @NotNull
        public String toString() {
            return "Empty TypeSubstitution";
        }

        @Nullable
        public Void get(@NotNull KotlinType kotlinType) {
            kotlinType.getClass();
            return null;
        }
    };

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    @NotNull
    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(this);
        typeSubstitutorCreate.getClass();
        return typeSubstitutorCreate;
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        annotations.getClass();
        return annotations;
    }

    @Nullable
    /* JADX INFO: renamed from: get */
    public abstract TypeProjection mo982get(@NotNull KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        kotlinType.getClass();
        variance.getClass();
        return kotlinType;
    }

    @NotNull
    public final TypeSubstitution replaceWithNonApproximating() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.replaceWithNonApproximating.1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            @NotNull
            public Annotations filterAnnotations(@NotNull Annotations annotations) {
                annotations.getClass();
                return TypeSubstitution.this.filterAnnotations(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            @Nullable
            /* JADX INFO: renamed from: get */
            public TypeProjection mo982get(@NotNull KotlinType kotlinType) {
                kotlinType.getClass();
                return TypeSubstitution.this.mo982get(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean isEmpty() {
                return TypeSubstitution.this.isEmpty();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            @NotNull
            public KotlinType prepareTopLevelType(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
                kotlinType.getClass();
                variance.getClass();
                return TypeSubstitution.this.prepareTopLevelType(kotlinType, variance);
            }
        };
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
