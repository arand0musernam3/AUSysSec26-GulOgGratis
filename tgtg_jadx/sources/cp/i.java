package cp;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.animation.Animation;
import c5.v0;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.remote.user.response.charity.ProductCategory;
import d2.z2;
import d8.d1;
import f2.c0;
import j5.b0;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import m3.d3;
import org.bouncycastle.iana.AEADAlgorithm;
import z4.z;
import zendesk.core.ui.android.internal.xml.richtext.HtmlTagHandler;
import zendesk.faye.FayeClientBuilder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13387a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = null;
        switch (this.f13387a) {
            case 0:
                ((Integer) obj).intValue();
                return Unit.f26487a;
            case 1:
                ((z) obj).getClass();
                return Unit.f26487a;
            case 2:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                j5.z.r(b0Var, -1.0f);
                j5.z.k(b0Var, 0);
                return Unit.f26487a;
            case 3:
                b0 b0Var2 = (b0) obj;
                b0Var2.getClass();
                j5.z.r(b0Var2, -1.0f);
                j5.z.k(b0Var2, 0);
                return Unit.f26487a;
            case 4:
                return Unit.f26487a;
            case 5:
                return Unit.f26487a;
            case 6:
                return Unit.f26487a;
            case 7:
                return Unit.f26487a;
            case 8:
                return Unit.f26487a;
            case 9:
                return ((z2) obj).f13986c;
            case 10:
                return ((z2) obj).f13988e;
            case 11:
                return ((z2) obj).f13989f;
            case 12:
                return ((z2) obj).f13990g;
            case 13:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new d1(absolutePath);
            case 14:
                ProductCategory productCategory = (ProductCategory) obj;
                productCategory.getClass();
                return productCategory.getLabel();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Animation) obj).getClass();
                return Unit.f26487a;
            case 16:
                ((Animation) obj).getClass();
                return Unit.f26487a;
            case 17:
                b0 b0Var3 = (b0) obj;
                b0Var3.getClass();
                j5.z.r(b0Var3, -1.0f);
                j5.z.k(b0Var3, 0);
                return Unit.f26487a;
            case 18:
                u3.i iVar = (u3.i) obj;
                d3 d3Var = v0.f7390b;
                iVar.getClass();
                Context baseContext = (Context) m3.i.y(iVar, d3Var);
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (baseContext instanceof Activity) {
                            context = baseContext;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                }
                return (Activity) context;
            case 19:
                ((f70.h) obj).getClass();
                return Boolean.FALSE;
            case 20:
                return HtmlTagHandler.Companion.formatCodeBlockContent$lambda$0((MatchResult) obj);
            case 21:
                ((String) obj).getClass();
                return Unit.f26487a;
            case 22:
                int i11 = ManufacturerItemDetailsActivity.f9137q;
                ((View) obj).getClass();
                return Unit.f26487a;
            case 23:
                ((Unit) obj).getClass();
                return Boolean.TRUE;
            case 24:
                ((Integer) obj).getClass();
                return null;
            case 25:
                return Unit.f26487a;
            case 26:
                List list = (List) obj;
                return new c0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 27:
                return Unit.f26487a;
            case 28:
                return FayeClientBuilder.json$lambda$0((n90.h) obj);
            default:
                nq.d dVar = (nq.d) obj;
                dVar.getClass();
                return Boolean.valueOf(dVar.isManufacturer());
        }
    }

    public /* synthetic */ i(int i11) {
        this.f13387a = i11;
    }
}
