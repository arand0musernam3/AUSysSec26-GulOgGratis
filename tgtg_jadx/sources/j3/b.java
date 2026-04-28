package j3;

import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f24477a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[][] f24478b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f24479c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[][] f24480d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double[][] f24481e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double[][] f24482f = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double[][] f24483g = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double[] f24484h = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final double[] f24485i = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    public static boolean a(double d3, double d11, double d12) {
        return ((d11 - d3) + 25.132741228718345d) % 6.283185307179586d < ((d12 - d3) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static int b(double d3) {
        double d11 = (d3 + 16.0d) / 116.0d;
        double d12 = d3 > 8.0d ? d11 * d11 * d11 : d3 / 903.2962962962963d;
        double d13 = d11 * d11 * d11;
        boolean z11 = d13 > 0.008856451679035631d;
        double d14 = z11 ? d13 : d3 / 903.2962962962963d;
        if (!z11) {
            d13 = d3 / 903.2962962962963d;
        }
        float[] fArr = f24479c;
        double d15 = d14 * ((double) fArr[0]);
        double d16 = d12 * ((double) fArr[1]);
        double d17 = d13 * ((double) fArr[2]);
        double[][] dArr = f24481e;
        double[] dArr2 = dArr[0];
        double d18 = (dArr2[2] * d17) + (dArr2[1] * d16) + (dArr2[0] * d15);
        double[] dArr3 = dArr[1];
        double d19 = (dArr3[2] * d17) + (dArr3[1] * d16) + (dArr3[0] * d15);
        double[] dArr4 = dArr[2];
        return ((d(d18) & 255) << 16) | RoundCornerImageView.DEFAULT_STROKE_COLOR | ((d(d19) & 255) << 8) | (d((dArr4[2] * d17) + (dArr4[1] * d16) + (dArr4[0] * d15)) & 255);
    }

    public static double c(double d3) {
        double dPow = Math.pow(Math.abs(d3), 0.42d);
        return ((((double) (d3 < 0.0d ? -1 : d3 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static int d(double d3) {
        double d11 = d3 / 100.0d;
        int iRound = (int) Math.round((d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static a e(int i11) {
        c cVar = c.f24486k;
        float fK = k((i11 >> 16) & 255);
        float fK2 = k((i11 >> 8) & 255);
        float fK3 = k(i11 & 255);
        double d3 = fK;
        double[][] dArr = f24480d;
        double[] dArr2 = dArr[0];
        double d11 = fK2;
        double d12 = fK3;
        double d13 = (dArr2[2] * d12) + (dArr2[1] * d11) + (dArr2[0] * d3);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[2] * d12) + (dArr3[1] * d11) + (dArr3[0] * d3);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d13, (float) d14, (float) ((d12 * dArr4[2]) + (d11 * dArr4[1]) + (d3 * dArr4[0]))};
        float f11 = fArr[0];
        float[][] fArr2 = f24477a;
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = (fArr3[1] * f13) + f12;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14;
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f11 * fArr5[0]);
        float[] fArr6 = cVar.f24493g;
        float f19 = cVar.f24491e;
        float f20 = cVar.f24488b;
        float f21 = fArr6[0] * f16;
        float f22 = fArr6[1] * f17;
        float f23 = fArr6[2] * f18;
        float f24 = cVar.f24494h;
        double d15 = 0.42f;
        float fPow = (float) Math.pow((Math.abs(f21) * f24) / 100.0f, d15);
        float fPow2 = (float) Math.pow((Math.abs(f22) * f24) / 100.0f, d15);
        float fPow3 = (float) Math.pow((Math.abs(f23) * f24) / 100.0f, d15);
        float fSignum = ((Math.signum(f21) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f22) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f23) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f25 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f26 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f27 = fSignum2 * 20.0f;
        float f28 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f27)) / 20.0f;
        float f29 = (((fSignum * 40.0f) + f27) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f26, f25)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f31 = fAtan2;
        float f32 = (f31 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f29 * cVar.f24489c) / f20, cVar.f24496j * f19)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f31) < 20.14d ? 360 + f31 : f31) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * cVar.f24492f) * cVar.f24490d) * ((float) Math.sqrt((f26 * f26) + (f25 * f25)))) / (f28 + 0.305f), 0.9f)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.29f, cVar.f24487a)), 0.73f)) * ((float) Math.sqrt(fPow4 / 100.0f));
        float f33 = cVar.f24495i * fPow5;
        Math.sqrt((r2 * f19) / (f20 + 4.0f));
        float f34 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f33 * 0.0228f) + 1.0f)) * 43.85965f;
        double d16 = f32;
        return new a(f31, fPow5, fPow4, f34, fLog * ((float) Math.cos(d16)), fLog * ((float) Math.sin(d16)));
    }

    public static a f(float f11, float f12, float f13) {
        float f14 = c.f24486k.f24495i * f12;
        Math.sqrt(((f12 / ((float) Math.sqrt(((double) f11) / 100.0d))) * r0.f24491e) / (r0.f24488b + 4.0f));
        float f15 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float fLog = ((float) Math.log((((double) f14) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f13) / 180.0f;
        return new a(f13, f12, f11, f15, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    public static double g(double[] dArr) {
        double d3 = dArr[0];
        double[][] dArr2 = f24482f;
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d3;
        double d12 = dArr[1];
        double d13 = (dArr3[1] * d12) + d11;
        double d14 = dArr[2];
        double d15 = (dArr3[2] * d14) + d13;
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[2] * d14) + (dArr4[1] * d12) + (dArr4[0] * d3);
        double[] dArr5 = dArr2[2];
        double d17 = (d14 * dArr5[2]) + (d12 * dArr5[1]) + (d3 * dArr5[0]);
        double dC = c(d15);
        double dC2 = c(d16);
        double dC3 = c(d17);
        return Math.atan2(((dC + dC2) - (dC3 * 2.0d)) / 9.0d, ((((-12.0d) * dC2) + (dC * 11.0d)) + dC3) / 11.0d);
    }

    public static int h(float f11) {
        if (f11 < 1.0f) {
            return RoundCornerImageView.DEFAULT_STROKE_COLOR;
        }
        if (f11 > 99.0f) {
            return -1;
        }
        float f12 = (f11 + 16.0f) / 116.0f;
        float f13 = f11 > 8.0f ? f12 * f12 * f12 : f11 / 903.2963f;
        float f14 = f12 * f12 * f12;
        boolean z11 = f14 > 0.008856452f;
        float f15 = z11 ? f14 : ((f12 * 116.0f) - 16.0f) / 903.2963f;
        if (!z11) {
            f14 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f24479c;
        return x6.c.a(f15 * fArr[0], f13 * fArr[1], f14 * fArr[2]);
    }

    public static double i(double d3) {
        double dAbs = Math.abs(d3);
        return Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d) * ((double) (d3 < 0.0d ? -1 : d3 == 0.0d ? 0 : 1));
    }

    public static boolean j(double d3) {
        return 0.0d <= d3 && d3 <= 100.0d;
    }

    public static float k(int i11) {
        float f11 = i11 / 255.0f;
        return (f11 <= 0.04045f ? f11 / 12.92f : (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4f)) * 100.0f;
    }

    public static double l(double d3) {
        double d11 = d3 / 100.0d;
        return (d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * ((double) 255);
    }
}
