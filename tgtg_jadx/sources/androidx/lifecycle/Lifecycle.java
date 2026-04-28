package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "androidx/lifecycle/w", "State", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n1#2:380\n*E\n"})
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.d f3411a = new se.d(4);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CREATED;
        public static final State DESTROYED;
        public static final State INITIALIZED;
        public static final State RESUMED;
        public static final State STARTED;

        static {
            State state = new State("DESTROYED", 0);
            DESTROYED = state;
            State state2 = new State("INITIALIZED", 1);
            INITIALIZED = state2;
            State state3 = new State("CREATED", 2);
            CREATED = state3;
            State state4 = new State("STARTED", 3);
            STARTED = state4;
            State state5 = new State("RESUMED", 4);
            RESUMED = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = new a80.b(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean a(State state) {
            state.getClass();
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(d0 d0Var);

    public abstract State b();

    public y80.h1 c() {
        a2 a2VarC = y80.r.c(b());
        a(new s(a2VarC, 0));
        return new y80.h1(a2VarC);
    }

    public abstract void d(d0 d0Var);
}
