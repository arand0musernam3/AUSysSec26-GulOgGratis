package zendesk.conversationkit.android.internal.user;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.AuthenticationDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.conversationkit.android.internal.user.AuthenticationErrorHandler$retrieveJWT$2$newJWT$1", f = "AuthenticationErrorHandler.kt", l = {150}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
public final class AuthenticationErrorHandler$retrieveJWT$2$newJWT$1 extends i implements Function2<b0, c<? super String>, Object> {
    final /* synthetic */ AuthenticationDelegate $authenticationDelegate;
    final /* synthetic */ Exception $error;
    int label;
    final /* synthetic */ AuthenticationErrorHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationErrorHandler$retrieveJWT$2$newJWT$1(AuthenticationErrorHandler authenticationErrorHandler, AuthenticationDelegate authenticationDelegate, Exception exc, c<? super AuthenticationErrorHandler$retrieveJWT$2$newJWT$1> cVar) {
        super(2, cVar);
        this.this$0 = authenticationErrorHandler;
        this.$authenticationDelegate = authenticationDelegate;
        this.$error = exc;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new AuthenticationErrorHandler$retrieveJWT$2$newJWT$1(this.this$0, this.$authenticationDelegate, this.$error, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super String> cVar) {
        return ((AuthenticationErrorHandler$retrieveJWT$2$newJWT$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        AuthenticationErrorHandler authenticationErrorHandler = this.this$0;
        AuthenticationDelegate authenticationDelegate = this.$authenticationDelegate;
        Exception exc = this.$error;
        this.label = 1;
        Object objOnInvalidAuthSuspend = authenticationErrorHandler.onInvalidAuthSuspend(authenticationDelegate, exc, this);
        return objOnInvalidAuthSuspend == aVar ? aVar : objOnInvalidAuthSuspend;
    }
}
