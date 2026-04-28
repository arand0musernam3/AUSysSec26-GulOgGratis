package v30;

import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import androidx.core.util.Consumer;
import com.app.tgtg.model.local.GenericErrors;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlinx.coroutines.DispatchException;
import pg.n;
import v80.l;
import yi.f0;
import ym.u;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41947c;

    public /* synthetic */ a(Runnable runnable, rb.k kVar) {
        this.f41945a = 6;
        this.f41947c = runnable;
        this.f41946b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws DispatchException {
        switch (this.f41945a) {
            case 0:
                b bVar = (b) this.f41946b;
                Runnable runnable = (Runnable) this.f41947c;
                Process.setThreadPriority(bVar.f41951c);
                StrictMode.ThreadPolicy threadPolicy = bVar.f41952d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 1:
                Callable callable = (Callable) this.f41946b;
                h hVar = (h) ((m1.a) this.f41947c).f28697a;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e5) {
                    hVar.l(e5);
                    return;
                }
            case 2:
                ((n) this.f41946b).f35001t.startAnimation((TranslateAnimation) this.f41947c);
                return;
            case 3:
                ((Consumer) this.f41946b).accept((m0.d) this.f41947c);
                return;
            case 4:
                ((w6.a) this.f41946b).j((Typeface) this.f41947c);
                return;
            case 5:
                ((l) this.f41946b).D((w80.c) this.f41947c, Unit.f26487a);
                return;
            case 6:
                Runnable runnable2 = (Runnable) this.f41947c;
                rb.k kVar = (rb.k) this.f41946b;
                try {
                    runnable2.run();
                    return;
                } finally {
                    kVar.a();
                }
            case 7:
                f0 f0Var = (f0) this.f41946b;
                lz.i iVar = (lz.i) this.f41947c;
                f0Var.f45997w++;
                f0Var.O(iVar);
                return;
            case 8:
                ((u) this.f41946b).A((GenericErrors) this.f41947c);
                return;
            default:
                MessageReceiptView.animateTailDrop$lambda$4$lambda$2((ImageView) this.f41946b, (MessageReceiptView) this.f41947c);
                return;
        }
    }

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f41945a = i11;
        this.f41946b = obj;
        this.f41947c = obj2;
    }
}
