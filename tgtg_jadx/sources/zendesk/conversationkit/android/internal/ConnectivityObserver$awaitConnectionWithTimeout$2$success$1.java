package zendesk.conversationkit.android.internal;

import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.f1;
import y80.r;
import zendesk.conversationkit.android.ConnectionStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@z70.e(c = "zendesk.conversationkit.android.internal.ConnectivityObserver$awaitConnectionWithTimeout$2$success$1", f = "ConnectivityObserver.kt", l = {100}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)Z"}, k = 3, mv = {2, 1, 0})
public final class ConnectivityObserver$awaitConnectionWithTimeout$2$success$1 extends z70.i implements Function2<b0, x70.c<? super Boolean>, Object> {
    int label;
    final /* synthetic */ ConnectivityObserver this$0;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.ConnectivityObserver$awaitConnectionWithTimeout$2$success$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.conversationkit.android.internal.ConnectivityObserver$awaitConnectionWithTimeout$2$success$1$1", f = "ConnectivityObserver.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lzendesk/conversationkit/android/ConnectionStatus;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.i implements Function2<ConnectionStatus, x70.c<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConnectionStatus connectionStatus, x70.c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(connectionStatus, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                ba0.g.M(obj);
                return Boolean.valueOf(((ConnectionStatus) this.L$0) == ConnectionStatus.CONNECTED);
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityObserver$awaitConnectionWithTimeout$2$success$1(ConnectivityObserver connectivityObserver, x70.c<? super ConnectivityObserver$awaitConnectionWithTimeout$2$success$1> cVar) {
        super(2, cVar);
        this.this$0 = connectivityObserver;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new ConnectivityObserver$awaitConnectionWithTimeout$2$success$1(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super Boolean> cVar) {
        return ((ConnectivityObserver$awaitConnectionWithTimeout$2$success$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            ba0.g.M(obj);
            f1 f1Var = this.this$0.connectionState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (r.p(f1Var, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Boolean.TRUE;
    }
}
