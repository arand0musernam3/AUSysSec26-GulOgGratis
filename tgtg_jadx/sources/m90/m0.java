package m90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements KType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KType f29827a;

    public m0(KType kType) {
        kType.getClass();
        this.f29827a = kType;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        m0 m0Var = obj instanceof m0 ? (m0) obj : null;
        KType kType = m0Var != null ? m0Var.f29827a : null;
        KType kType2 = this.f29827a;
        if (!Intrinsics.areEqual(kType2, kType)) {
            return false;
        }
        KClassifier classifier = kType2.getClassifier();
        if (classifier instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType3 != null ? kType3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return Intrinsics.areEqual(y9.w.v((KClass) classifier), y9.w.v((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.f29827a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.f29827a.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.f29827a.getClassifier();
    }

    public final int hashCode() {
        return this.f29827a.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.f29827a.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f29827a;
    }
}
