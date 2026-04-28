package r7;

import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f37744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f37745c;

    public /* synthetic */ a(Function1 function1, Ref.ObjectRef objectRef, int i11) {
        this.f37743a = i11;
        this.f37744b = function1;
        this.f37745c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37743a) {
            case 0:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeCreate$lambda$0(this.f37744b, this.f37745c);
            case 1:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeGet$lambda$1(this.f37744b, this.f37745c);
            default:
                Ref.ObjectRef objectRef = this.f37745c;
                this.f37744b.invoke(CollectionsKt.r0((Iterable) objectRef.element));
                ((List) objectRef.element).clear();
                return Unit.f26487a;
        }
    }
}
