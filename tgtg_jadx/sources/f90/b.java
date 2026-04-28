package f90;

import androidx.credentials.exceptions.ClearCredentialException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlinx.coroutines.DispatchException;
import n7.l;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements OnCompleteListener, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80.l f17528a;

    public /* synthetic */ b(v80.l lVar) {
        this.f17528a = lVar;
    }

    @Override // n7.l
    public void a(Object obj) {
        ClearCredentialException clearCredentialException = (ClearCredentialException) obj;
        clearCredentialException.getClass();
        v80.l lVar = this.f17528a;
        if (lVar.g()) {
            o oVar = q.f40850b;
            lVar.resumeWith(new p(clearCredentialException));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) throws DispatchException {
        Exception exception = task.getException();
        v80.l lVar = this.f17528a;
        if (exception != null) {
            o oVar = q.f40850b;
            lVar.resumeWith(new p(exception));
        } else if (task.l()) {
            lVar.j(null);
        } else {
            o oVar2 = q.f40850b;
            lVar.resumeWith(task.getResult());
        }
    }

    @Override // n7.l
    public void onResult(Object obj) {
        v80.l lVar = this.f17528a;
        if (lVar.g()) {
            o oVar = q.f40850b;
            lVar.resumeWith(Unit.f26487a);
        }
    }
}
