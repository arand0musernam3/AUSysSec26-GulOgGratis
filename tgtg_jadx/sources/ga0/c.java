package ga0;

import com.braze.managers.o;
import com.braze.storage.p;
import com.braze.support.ValidationUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.support.UriUtils;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f20278b;

    public /* synthetic */ c(Ref.ObjectRef objectRef, int i11) {
        this.f20277a = i11;
        this.f20278b = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20277a) {
            case 0:
                r90.e.b((Closeable) this.f20278b.element);
                return Unit.f26487a;
            case 1:
                return p.a(this.f20278b);
            case 2:
                return ValidationUtils.ensureBrazeFieldLength$lambda$0(this.f20278b);
            case 3:
                return WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$7(this.f20278b);
            case 4:
                return WebContentUtils.unpackZipIntoDirectory$lambda$10$lambda$9(this.f20278b);
            case 5:
                return com.braze.communication.dust.h.a(this.f20278b);
            case 6:
                return com.braze.communication.dust.h.b(this.f20278b);
            case 7:
                return com.braze.communication.dust.i.a(this.f20278b);
            case 8:
                return com.braze.communication.dust.i.b(this.f20278b);
            case 9:
                return UriUtils.getQueryParameters$lambda$0(this.f20278b);
            case 10:
                return UriUtils.getQueryParameters$lambda$2(this.f20278b);
            default:
                return o.a(this.f20278b);
        }
    }
}
