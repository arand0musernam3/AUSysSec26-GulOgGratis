package lb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import gt.e;
import gt.u;
import ib.d0;
import ib.g0;
import ib.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb.h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import m2.c2;
import o00.x0;
import qb.f;
import qb.g;
import qb.o;
import r8.k;
import y9.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f27580f = w.f("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f27582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f27583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f27584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib.b f27585e;

    public d(Context context, WorkDatabase workDatabase, ib.b bVar) {
        JobScheduler jobSchedulerB = a.b(context);
        c cVar = new c(context, bVar.f23695d, bVar.l);
        this.f27581a = context;
        this.f27582b = jobSchedulerB;
        this.f27583c = cVar;
        this.f27584d = workDatabase;
        this.f27585e = bVar;
    }

    public static void c(JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable th2) {
            w.d().c(f27580f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i11)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = a.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static qb.h f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new qb.h(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // jb.h
    public final void a(o... oVarArr) {
        int iIntValue;
        ib.b bVar = this.f27585e;
        WorkDatabase workDatabase = this.f27584d;
        ky.o oVar = new ky.o(workDatabase);
        boolean z11 = false;
        for (o oVar2 : oVarArr) {
            workDatabase.b();
            try {
                qb.w wVarX = workDatabase.x();
                String str = oVar2.f36828a;
                o oVarE = wVarX.e(str);
                String str2 = f27580f;
                if (oVarE == null) {
                    w.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (oVarE.f36829b != g0.ENQUEUED) {
                    w.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    qb.h hVarV = wd.a.v(oVar2);
                    int i11 = hVarV.f36800b;
                    String str3 = hVarV.f36799a;
                    g gVarU = workDatabase.u();
                    gVarU.getClass();
                    str3.getClass();
                    f fVar = (f) x0.A(gVarU.f36797a, true, z11, new u(str3, i11, 1));
                    if (fVar != null) {
                        iIntValue = fVar.f36796c;
                    } else {
                        bVar.getClass();
                        int i12 = bVar.f23700i;
                        WorkDatabase workDatabase2 = (WorkDatabase) oVar.f26718b;
                        he.g gVar = new he.g(oVar, i12, 1);
                        workDatabase2.getClass();
                        Object objP = workDatabase2.p(new y.a(gVar, 6));
                        objP.getClass();
                        iIntValue = ((Number) objP).intValue();
                    }
                    if (fVar == null) {
                        f fVar2 = new f(str3, i11, iIntValue);
                        g gVarU2 = workDatabase.u();
                        gVarU2.getClass();
                        v vVar = gVarU2.f36797a;
                        c2 c2Var = new c2(18, gVarU2, fVar2);
                        z11 = false;
                        x0.A(vVar, false, true, c2Var);
                    } else {
                        z11 = false;
                    }
                    g(oVar2, iIntValue);
                    workDatabase.q();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // jb.h
    public final boolean b() {
        return true;
    }

    @Override // jb.h
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.f27581a;
        JobScheduler jobScheduler = this.f27582b;
        ArrayList<JobInfo> arrayListE = e(context, jobScheduler);
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListE) {
                qb.h hVarF = f(jobInfo);
                if (hVarF != null && str.equals(hVarF.f36799a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((Integer) it.next()).intValue());
        }
        g gVarU = this.f27584d.u();
        gVarU.getClass();
        str.getClass();
        x0.A(gVarU.f36797a, false, true, new e(str, 25));
    }

    public final void g(o oVar, int i11) {
        String str;
        JobInfo jobInfoA = this.f27583c.a(oVar, i11);
        w wVarD = w.d();
        StringBuilder sb2 = new StringBuilder("Scheduling work ID ");
        String str2 = oVar.f36828a;
        sb2.append(str2);
        sb2.append("Job ID ");
        sb2.append(i11);
        String string = sb2.toString();
        String str3 = f27580f;
        wVarD.a(str3, string);
        try {
            if (this.f27582b.schedule(jobInfoA) == 0) {
                w.d().g(str3, "Unable to schedule work ID " + str2);
                if (oVar.f36843q && oVar.f36844r == d0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    oVar.f36843q = false;
                    w.d().a(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(oVar, i11);
                }
            }
        } catch (IllegalStateException e5) {
            String str4 = a.f27574a;
            Context context = this.f27581a;
            context.getClass();
            WorkDatabase workDatabase = this.f27584d;
            workDatabase.getClass();
            ib.b bVar = this.f27585e;
            bVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            int i13 = i12 >= 31 ? 150 : 100;
            int size = ((List) x0.A(workDatabase.x().f36870a, true, false, new nv.a(29))).size();
            String strU = "<faulty JobScheduler failed to getPendingJobs>";
            if (i12 >= 34) {
                JobScheduler jobSchedulerB = a.b(context);
                List listA = a.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListE = e(context, jobSchedulerB);
                    int size2 = arrayListE != null ? listA.size() - arrayListE.size() : 0;
                    String str5 = null;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListE2 = e(context, (JobScheduler) systemService);
                    int size3 = arrayListE2 != null ? arrayListE2.size() : 0;
                    if (size3 != 0) {
                        str5 = size3 + " from WorkManager in the default namespace";
                    }
                    strU = CollectionsKt.U(y.w(new String[]{listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str5}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListE3 = e(context, a.b(context));
                if (arrayListE3 != null) {
                    strU = arrayListE3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb3 = new StringBuilder("JobScheduler ");
            sb3.append(i13);
            sb3.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb3.append(strU);
            sb3.append(".\nThere are ");
            sb3.append(size);
            sb3.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strO = k.o(sb3, bVar.f23702k, '.');
            w.d().b(str3, strO);
            wy.o.k(strO, e5);
        } catch (Throwable th2) {
            w.d().c(str3, "Unable to schedule " + oVar, th2);
        }
    }
}
