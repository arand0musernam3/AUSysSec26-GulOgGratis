package jl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25314a;

    public e(Map map) {
        this.f25314a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f25314a, ((e) obj).f25314a);
    }

    public final int hashCode() {
        return this.f25314a.hashCode();
    }

    public final String toString() {
        return "OnboardingSurveyState(onboardingAnswerMap=" + this.f25314a + ")";
    }
}
