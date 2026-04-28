package a3;

import android.app.Activity;
import android.view.View;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeImageUtils;
import com.braze.support.JsonUtils;
import com.braze.ui.support.ViewUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f442c;

    public /* synthetic */ l0(x90.n nVar, int i11, x90.b bVar) {
        this.f440a = 8;
        this.f442c = nVar;
        this.f441b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f440a) {
            case 0:
                return Integer.valueOf(((f0) this.f442c).f342f.f29618b.d(this.f441b));
            case 1:
                dq.i iVar = (dq.i) this.f442c;
                int i11 = this.f441b;
                y80.a2 a2Var = iVar.f15159d;
                List list = (List) a2Var.getValue();
                ArrayList arrayListT0 = CollectionsKt.t0(list);
                int i12 = 0;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue() && (i12 = i12 + 1) < 0) {
                            kotlin.collections.d0.m();
                            throw null;
                        }
                    }
                }
                if (i12 < 2) {
                    arrayListT0.set(i11, Boolean.valueOf(!((Boolean) arrayListT0.get(i11)).booleanValue()));
                    a2Var.k(null, arrayListT0);
                } else if (((Boolean) arrayListT0.get(i11)).booleanValue()) {
                    arrayListT0.set(i11, Boolean.FALSE);
                    a2Var.k(null, arrayListT0);
                }
                return Unit.f26487a;
            case 2:
                gq.b bVar = (gq.b) this.f442c;
                int i13 = this.f441b;
                y80.a2 a2Var2 = bVar.f20790d;
                List list2 = (List) a2Var2.getValue();
                ArrayList arrayListT02 = CollectionsKt.t0(list2);
                int i14 = 0;
                if (!list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) it2.next()).booleanValue() && (i14 = i14 + 1) < 0) {
                            kotlin.collections.d0.m();
                            throw null;
                        }
                    }
                }
                if (i14 < 2) {
                    arrayListT02.set(i13, Boolean.valueOf(!((Boolean) arrayListT02.get(i13)).booleanValue()));
                    a2Var2.k(null, arrayListT02);
                } else if (((Boolean) arrayListT02.get(i13)).booleanValue()) {
                    arrayListT02.set(i13, Boolean.FALSE);
                    a2Var2.k(null, arrayListT02);
                }
                return Unit.f26487a;
            case 3:
                return Boolean.valueOf(((v1.y1) this.f442c).f41888a.h() > this.f441b);
            case 4:
                return new i2.b(this.f441b, 0.0f, (Function0) this.f442c);
            case 5:
                return BrazeImageUtils.getRemoteBitmap$lambda$18(this.f441b, (URL) this.f442c);
            case 6:
                return JsonUtils.convertStringJsonArrayToList$lambda$1(this.f441b, (JSONArray) this.f442c);
            case 7:
                ((w2.e1) this.f442c).O0(this.f441b);
                return Boolean.TRUE;
            case 8:
                x90.n nVar = (x90.n) this.f442c;
                int i15 = this.f441b;
                nVar.f44142k.getClass();
                synchronized (nVar) {
                    nVar.f44155y.remove(Integer.valueOf(i15));
                }
                return Unit.f26487a;
            case 9:
                return ViewUtils.setActivityRequestedOrientation$lambda$4(this.f441b, (Activity) this.f442c);
            case 10:
                return ViewUtils.isCurrentOrientationValid$lambda$7(this.f441b, (Orientation) this.f442c);
            case 11:
                return MessageLogView.showNewMessagesViewIfNeeded$lambda$23$lambda$20((MessageLogView) this.f442c, this.f441b);
            case 12:
                return ((View) this.f442c).findViewById(this.f441b);
            case 13:
                return com.braze.managers.w.a(this.f441b, (com.braze.managers.w) this.f442c);
            default:
                return com.braze.managers.z0.a((Integer) this.f442c, this.f441b);
        }
    }

    public /* synthetic */ l0(Object obj, int i11, int i12) {
        this.f440a = i12;
        this.f442c = obj;
        this.f441b = i11;
    }

    public /* synthetic */ l0(int i11, Object obj, int i12) {
        this.f440a = i12;
        this.f441b = i11;
        this.f442c = obj;
    }
}
