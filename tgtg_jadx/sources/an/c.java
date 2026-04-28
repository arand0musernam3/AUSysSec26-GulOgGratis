package an;

import a3.p2;
import a90.p;
import android.animation.Animator;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.widget.LinearLayout;
import androidx.core.util.Consumer;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import pg.c0;
import pg.y2;
import r8.k;
import v80.b0;
import v80.f0;
import v80.p0;
import ym.o;
import ym.u;
import ym.w;
import ym.y;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1623d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i11) {
        this.f1620a = i11;
        this.f1621b = obj;
        this.f1622c = obj2;
        this.f1623d = obj3;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Set setD;
        Unit unit;
        int i11 = this.f1620a;
        int i12 = 1;
        boolean z11 = false;
        boolean z12 = false;
        Object obj2 = this.f1623d;
        Object obj3 = this.f1622c;
        Object obj4 = this.f1621b;
        switch (i11) {
            case 0:
                y yVar = (y) obj3;
                String str = (String) obj2;
                ((Animator) obj).getClass();
                ((c0) ((a50.c) obj4).f822b).f986f.setVisibility(8);
                if (yVar != null) {
                    u uVar = (u) yVar;
                    if (str != null) {
                        SharedPreferences sharedPreferencesX = ft.c.x();
                        String strY = ft.c.y();
                        if (strY == null) {
                            strY = null;
                        }
                        String string = sharedPreferencesX.getString(strY + "_blockedIntroBanners", "");
                        if (string == null || string.length() == 0) {
                            setD = h1.d(str);
                        } else {
                            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.P(string, "[", "]"), new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
                            ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
                            Iterator it = listSplit$default.iterator();
                            while (it.hasNext()) {
                                arrayList.add(StringsKt.e0((String) it.next()).toString());
                            }
                            LinkedHashSet linkedHashSetU0 = CollectionsKt.u0(arrayList);
                            linkedHashSetU0.add(str);
                            setD = linkedHashSetU0;
                        }
                        SharedPreferences.Editor editorEdit = ft.c.x().edit();
                        String strY2 = ft.c.y();
                        if (strY2 == null) {
                            strY2 = null;
                        }
                        editorEdit.putString(k.l(strY2, "_blockedIntroBanners"), CollectionsKt.U(CollectionsKt.r0(setD), MessageLogView.COMMA_SEPARATOR, null, null, null, 62));
                        editorEdit.apply();
                        uVar.r().d();
                        o oVar = uVar.f46236j;
                        if (oVar != null) {
                            oVar.f(AdapterItemType.INTRO_BANNER);
                            unit = Unit.f26487a;
                        } else {
                            unit = null;
                        }
                        if (unit != null) {
                        }
                    }
                    SharedPreferences.Editor editorEdit2 = ft.c.x().edit();
                    String strY3 = ft.c.y();
                    editorEdit2.putBoolean((strY3 != null ? strY3 : null) + "_showBasketIntroBanner", false);
                    editorEdit2.apply();
                    uVar.r().d();
                    w wVarR = uVar.r();
                    cv.i iVar = cv.i.ACTION_DISMISS_BASKET_INTRO;
                    iVar.getClass();
                    wVarR.f46255c.b(iVar);
                    o oVar2 = uVar.f46236j;
                    if (oVar2 != null) {
                        oVar2.f(AdapterItemType.BASKET_INTRO_BANNER);
                    }
                }
                break;
            case 1:
                d1.d dVar = (d1.d) obj4;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj3;
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                ((Surface) obj2).release();
                dVar.f13681e--;
                dVar.d();
                break;
            default:
                y2 y2Var = (y2) obj4;
                b0 b0Var = (b0) obj3;
                Function0 function0 = (Function0) obj2;
                ((Animator) obj).getClass();
                mv.d.x(y2Var.f35286f, new p2(13, function0));
                y2Var.f35289i.setVisibility(8);
                LinearLayout linearLayout = y2Var.f35285e;
                c90.f fVar = p0.f42144a;
                f0.B(b0Var, p.f1044a, null, new mn.g(linearLayout, y2Var, z12 ? 1 : 0, 13), 2);
                f0.B(b0Var, null, null, new co.o(function0, z11 ? 1 : 0, i12), 3);
                break;
        }
    }
}
