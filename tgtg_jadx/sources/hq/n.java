package hq;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import pg.m0;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22387a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22389c;

    public n(LinearLayoutManager linearLayoutManager, o oVar) {
        this.f22388b = linearLayoutManager;
        this.f22389c = oVar;
    }

    @Override // androidx.recyclerview.widget.c2
    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        int i13;
        int i14;
        int i15 = this.f22387a;
        Object obj = this.f22389c;
        Object obj2 = this.f22388b;
        switch (i15) {
            case 0:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj2;
                m0 m0Var = ((o) obj).f22394g;
                ImageView imageView = m0Var.f34984t;
                imageView.getClass();
                TextView textView = m0Var.f34985u;
                textView.getClass();
                if (linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(1);
                    int left = viewFindViewByPosition != null ? viewFindViewByPosition.getLeft() : 0;
                    if (mv.a.f30135a == 0) {
                        mv.a.f30135a = left;
                        mv.a.f30137c = left;
                    }
                    if (mv.a.f30136b == 0) {
                        mv.a.f30136b = imageView.getLeft() + 50;
                    }
                    int i16 = mv.a.f30137c;
                    if (left > i16 + 5 && i16 != (i14 = mv.a.f30135a)) {
                        if (left < i14) {
                            mv.a.f30137c = left;
                            mv.a.a(left, imageView, textView);
                        } else {
                            mv.a.f30137c = i14;
                            mv.a.a(i14, imageView, textView);
                        }
                        break;
                    } else if (left < i16 - 5 && i16 != (i13 = mv.a.f30136b)) {
                        if (left > i13) {
                            mv.a.f30137c = left;
                            mv.a.a(left, imageView, textView);
                        } else {
                            mv.a.f30137c = i13;
                            mv.a.a(i13, imageView, textView);
                        }
                        break;
                    }
                }
                break;
            default:
                x10.b bVar = ((x10.o) obj2).f43709a;
                x10.i iVar = (x10.i) obj;
                RecyclerView recyclerView2 = iVar.f43664h;
                int iFindFirstVisibleItemPosition = i11 < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).findLastVisibleItemPosition();
                Calendar calendarA = x10.r.a(bVar.f43641a.f43695a);
                calendarA.add(2, iFindFirstVisibleItemPosition);
                x10.l lVar = new x10.l(calendarA);
                iVar.f43660d = lVar;
                MaterialButton materialButton = iVar.f43668m;
                Calendar calendarA2 = x10.r.a(bVar.f43641a.f43695a);
                calendarA2.add(2, iFindFirstVisibleItemPosition);
                calendarA2.set(5, 1);
                Calendar calendarA3 = x10.r.a(calendarA2);
                calendarA3.get(2);
                calendarA3.get(1);
                calendarA3.getMaximum(7);
                calendarA3.getActualMaximum(5);
                calendarA3.getTimeInMillis();
                long timeInMillis = calendarA3.getTimeInMillis();
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = x10.r.f43713a;
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
                iVar.q(bVar.f43641a.e(lVar));
                break;
        }
    }

    public n(x10.i iVar, x10.o oVar) {
        this.f22389c = iVar;
        this.f22388b = oVar;
    }
}
