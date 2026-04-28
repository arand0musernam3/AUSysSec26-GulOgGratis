package a3;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f521b;

    public /* synthetic */ p2(int i11, Function0 function0) {
        this.f520a = i11;
        this.f521b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f520a;
        Function0 function0 = this.f521b;
        switch (i11) {
            case 0:
                return (h4.b) function0.invoke();
            case 1:
                return (h4.b) function0.invoke();
            case 2:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.f26487a;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 4:
                ((i4.s0) obj).c(((Number) function0.invoke()).floatValue());
                return Unit.f26487a;
            case 5:
                function0.invoke();
                return Unit.f26487a;
            case 6:
                function0.invoke();
                return Unit.f26487a;
            case 7:
                j5.b0 b0Var = (j5.b0) obj;
                Object objInvoke = function0.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f11 = (Float) objInvoke;
                j5.i iVar = new j5.i(f11 != null ? f11.floatValue() : 0.0f, new n80.f(1.0f));
                KProperty[] kPropertyArr = j5.z.f24734a;
                j5.a0 a0Var = j5.x.f24709c;
                KProperty kProperty = j5.z.f24734a[1];
                b0Var.b(a0Var, iVar);
                return Unit.f26487a;
            case 8:
                ((BasicItem) obj).getClass();
                function0.invoke();
                return Unit.f26487a;
            case 9:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.f26487a;
            case 10:
                Context context = (Context) obj;
                context.getClass();
                TextureView textureView = new TextureView(context);
                textureView.setSurfaceTextureListener(new lp.d0(textureView, function0));
                return textureView;
            case 11:
                obj.getClass();
                return function0.invoke();
            case 12:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f26487a;
            case 13:
                ((View) obj).getClass();
                function0.invoke();
                return Unit.f26487a;
            case 14:
                ((Boolean) obj).booleanValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((ha.a) obj).getClass();
                return function0.invoke();
            default:
                function0.invoke();
                return Unit.f26487a;
        }
    }
}
