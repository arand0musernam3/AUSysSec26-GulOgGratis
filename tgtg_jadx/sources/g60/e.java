package g60;

import android.content.Context;
import com.app.tgtg.customview.DiscoverLocationView;
import j5.b0;
import j5.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20064c;

    public /* synthetic */ e(boolean z11, String str) {
        this.f20062a = 1;
        this.f20063b = z11;
        this.f20064c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20062a) {
            case 0:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                String str = this.f20064c;
                if (str != null) {
                    z.h(str, b0Var);
                }
                if (this.f20063b) {
                    z.o("Loading", b0Var);
                }
                return Unit.f26487a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                DiscoverLocationView discoverLocationView = new DiscoverLocationView(context, null, 0, 0, 14, null);
                discoverLocationView.setupLocation(this.f20063b, this.f20064c);
                return discoverLocationView;
            default:
                b0 b0Var2 = (b0) obj;
                b0Var2.getClass();
                String str2 = this.f20064c;
                if (str2 != null) {
                    z.h(str2, b0Var2);
                }
                if (this.f20063b) {
                    z.o("Loading", b0Var2);
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ e(String str, boolean z11, int i11) {
        this.f20062a = i11;
        this.f20064c = str;
        this.f20063b = z11;
    }
}
