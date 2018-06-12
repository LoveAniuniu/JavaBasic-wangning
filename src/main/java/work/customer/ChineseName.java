import java.io.UnsupportedEncodingException;
import java.util.*;


public class ChineseName {
    public String getRandonName(){
        Random random=new Random(System.currentTimeMillis());
        String[] Surname= {"赵","钱","孙","李","周","吴","郑","王","冯","陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许",
                "何","吕","施","张","孔","曹","严","华","金","魏","陶","姜","戚","谢","邹","喻","柏","水","窦","章","云","苏","潘","葛","奚","范","彭","郎",
                "鲁","韦","昌","马","苗","凤","花","方","俞","任","袁","柳","酆","鲍","史","唐","费","廉","岑","薛","雷","贺","倪","汤","滕","殷",
                "罗","毕","郝","邬","安","常","乐","于","时","傅","皮","卞","齐","康","伍","余","元","卜","顾","孟","平","黄","和",
                "穆","萧","尹","姚","邵","湛","汪","祁","毛","禹","狄","米","贝","明","臧","计","伏","成","戴","谈","宋","茅","庞","熊","纪","舒",
                "屈","项","祝","董","梁","杜","阮","蓝","闵","席","季","麻","强","贾","路","娄","危","江","童","颜","郭","梅","盛","林","刁","钟",
                "徐","邱","骆","高","夏","蔡","田","樊","胡","凌","霍","虞","万","支","柯","昝","管","卢","莫","经","房","裘","缪","干","解","应",
                "宗","丁","宣","贲","邓","郁","单","杭","洪","包","诸","左","石","崔","吉","钮","龚","程","嵇","邢","滑","裴","陆","荣","翁","荀",
                "羊","于","惠","甄","曲","家","封","芮","羿","储","靳","汲","邴","糜","松","井","段","富","巫","乌","焦","巴","弓","牧","隗","山",
                "谷","车","侯","宓","蓬","全","郗","班","仰","秋","仲","伊","宫","宁","仇","栾","暴","甘","钭","厉","戎","祖","武","符","刘","景",
                "詹","束","龙","叶","幸","司","韶","郜","黎","蓟","溥","印","宿","白","怀","蒲","邰","从","鄂","索","咸","籍","赖","卓","蔺","屠",
                "蒙","池","乔","阴","郁","胥","能","苍","双","闻","莘","党","翟","谭","贡","劳","逄","姬","申","扶","堵","冉","宰","郦","雍","却",
                "璩","桑","桂","濮","牛","寿","通","边","扈","燕","冀","浦","尚","农","温","别","庄","晏","柴","瞿","阎","充","慕","连","茹","习",
                "宦","艾","鱼","容","向","古","易","慎","戈","廖","庾","终","暨","居","衡","步","都","耿","满","弘","匡","国","文","寇","广","禄",
                "阙","东","欧","殳","沃","利","蔚","越","夔","隆","师","巩","厍","聂","晁","勾","敖","融","冷","訾","辛","阚","那","简","饶","空",
                "曾","毋","沙","乜","养","鞠","须","丰","巢","关","蒯","相","查","后","荆","红","游","郏","竺","权","逯","盖","益","桓","公","仉",
                "督","岳","帅","缑","亢","况","郈","有","琴","归","海","晋","楚","闫","法","汝","鄢","涂","钦","商","牟","佘","佴","伯","赏","墨",
                "哈","谯","篁","年","爱","阳","佟","言","福","南","火","铁","迟","漆","官","冼","真","展","繁","檀","祭","密","敬","揭","舜","楼",
                "疏","冒","浑","挚","胶","随","高","皋","原","种","练","弥","仓","眭","蹇","覃","阿","门","恽","来","綦","召","仪","风","介","巨",
                "木","京","狐","郇","虎","枚","抗","达","杞","苌","折","麦","庆","过","竹","端","鲜","皇","亓","老","是","秘","畅","邝","还","宾",
                "闾","辜","纵","侴","万俟","司马","上官","欧阳","夏侯","诸葛","闻人","东方","赫连","皇甫","羊舌","尉迟","公羊","澹台","公冶","宗正",
                "濮阳","淳于","单于","太叔","申屠","公孙","仲孙","轩辕","令狐","钟离","宇文","长孙","慕容","鲜于","闾丘","司徒","司空","兀官","司寇",
                "南门","呼延","子车","颛孙","端木","巫马","公西","漆雕","车正","壤驷","公良","拓跋","夹谷","宰父","谷梁","段干","百里","东郭","微生",
                "梁丘","左丘","东门","西门","南宫","第五","公仪","公乘","太史","仲长","叔孙","屈突","尔朱","东乡","相里","胡母","司城","张廖","雍门",
                "毋丘","贺兰","綦毋","屋庐","独孤","南郭","北宫","王孙"};
        int index=random.nextInt(Surname.length-1);
        String name = Surname[index]; //获得一个随机的姓氏
        /* 从常用字中选取一个或两个字作为名 */
        if(random.nextBoolean()){
            name+=getChinese()+getChinese();
        }else {
            name+=getChinese();
        }
        return name;
    }



    public static String getChinese() {
        String str = null;
        int highPos, lowPos;
        Random random = new Random();
        highPos = (176 + Math.abs(random.nextInt(71)));//区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
        random=new Random();
        lowPos = 161 + Math.abs(random.nextInt(94));//位码，0xA0打头，范围第1~94列

        byte[] bArr = new byte[2];
        bArr[0] = (new Integer(highPos)).byteValue();
        bArr[1] = (new Integer(lowPos)).byteValue();
        try {
            str = new String(bArr, "GB2312");   //区位码组合成汉字
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }


    public static void main(String[] args) {
        ChineseName  name = new ChineseName();
        String name1 = name.getRandonName();
        IdCardGenerator g = new IdCardGenerator();
        String card = g.generate();

        System.out.println(card);
        System.out.println(name1);
    }

    /**
     *
     * 身份证算法实现
     *
     * 1、号码的结构 公民身份号码是特征组合码，
     *     由十七位数字本体码和一位校验码组成。
     * 排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码  三位数字顺序码和一位数字校验码。
     *
     * 2、地址码(前六位数） 表示编码对象常住户口所在县(市、旗、区)的行政区划代码，按GB/T2260的规定执行。
     *
     * 3、出生日期码（第七位至十四位） 表示编码对象出生的年、月、日，按GB/T7408的规定执行，年、月、日代码之间不用分隔符。
     *
     * 4、顺序码（第十五位至十七位）
     *    表示在同一地址码所标识的区域范围内，对同年、同月、同日出生的人编定的顺序号，顺序码的奇数分配给男性，偶数分配给女性。
     *
     * 5、校验码（第十八位数）
     *   （1）十七位数字本体码加权求和公式 S = Sum(Ai * Wi), i = 0, ... , 16
     * ，先对前17位数字的权求和
     *  Ai:表示第i位置上的身份证号码数字值
     *   Wi:表示第i位置上的加权因子 Wi: 7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2
     * （2）计算模 Y = mod(S, 11)
     * （3）通过模得到对应的校验码 Y: 0 1 2 3 4 5 6 7  8 9 10
     *   校验码: 1 0 X 9 8 7 6 5 4 3 2
     * @author longgangbai
     *
     */

    public static class IdCardGenerator {
        public static final Map<String, Integer> areaCode = new HashMap<String, Integer>();
        static {
            IdCardGenerator.areaCode.put("北京市", 110000);
            IdCardGenerator.areaCode.put("市辖区", 110100);
            IdCardGenerator.areaCode.put("东城区", 110101);
            IdCardGenerator.areaCode.put("西城区", 110102);
            IdCardGenerator.areaCode.put("崇文区", 110103);
            IdCardGenerator.areaCode.put("宣武区", 110104);
            IdCardGenerator.areaCode.put("朝阳区", 110105);
            IdCardGenerator.areaCode.put("丰台区", 110106);
            IdCardGenerator.areaCode.put("石景山区", 110107);
            IdCardGenerator.areaCode.put("海淀区", 110108);
            IdCardGenerator.areaCode.put("门头沟区", 110109);
            IdCardGenerator.areaCode.put("房山区", 110111);
            IdCardGenerator.areaCode.put("通州区", 110112);
            IdCardGenerator.areaCode.put("顺义区", 110113);
            IdCardGenerator.areaCode.put("昌平区", 110114);
            IdCardGenerator.areaCode.put("大兴区", 110115);
            IdCardGenerator.areaCode.put("怀柔区", 110116);
            IdCardGenerator.areaCode.put("平谷区", 110117);
            IdCardGenerator.areaCode.put("县", 110200);
            IdCardGenerator.areaCode.put("密云县", 110228);
            IdCardGenerator.areaCode.put("延庆县", 110229);
            IdCardGenerator.areaCode.put("天津市", 120000);
            IdCardGenerator.areaCode.put("市辖区", 120100);
            IdCardGenerator.areaCode.put("和平区", 120101);
            IdCardGenerator.areaCode.put("河东区", 120102);
            IdCardGenerator.areaCode.put("河西区", 120103);
            IdCardGenerator.areaCode.put("南开区", 120104);
            IdCardGenerator.areaCode.put("河北区", 120105);
            IdCardGenerator.areaCode.put("红桥区", 120106);
            IdCardGenerator.areaCode.put("东丽区", 120110);
            IdCardGenerator.areaCode.put("西青区", 120111);
            IdCardGenerator.areaCode.put("津南区", 120112);
            IdCardGenerator.areaCode.put("北辰区", 120113);
            IdCardGenerator.areaCode.put("武清区", 120114);
            IdCardGenerator.areaCode.put("宝坻区", 120115);
            IdCardGenerator.areaCode.put("县", 120200);
            IdCardGenerator.areaCode.put("宁河县", 120221);
            IdCardGenerator.areaCode.put("静海县", 120223);
            IdCardGenerator.areaCode.put("蓟　县", 120225);
            IdCardGenerator.areaCode.put("河北省", 130000);
            IdCardGenerator.areaCode.put("石家庄市", 130100);
            IdCardGenerator.areaCode.put("市辖区", 130101);
            IdCardGenerator.areaCode.put("长安区", 130102);
            IdCardGenerator.areaCode.put("桥东区", 130103);
            IdCardGenerator.areaCode.put("桥西区", 130104);
            IdCardGenerator.areaCode.put("新华区", 130105);
            IdCardGenerator.areaCode.put("井陉矿区", 130107);
            IdCardGenerator.areaCode.put("裕华区", 130108);
            IdCardGenerator.areaCode.put("井陉县", 130121);
            IdCardGenerator.areaCode.put("正定县", 130123);
            IdCardGenerator.areaCode.put("栾城县", 130124);
            IdCardGenerator.areaCode.put("行唐县", 130125);
            IdCardGenerator.areaCode.put("灵寿县", 130126);
            IdCardGenerator.areaCode.put("秦皇岛市", 130300);
            IdCardGenerator.areaCode.put("市辖区", 130301);
            IdCardGenerator.areaCode.put("海港区", 130302);
            IdCardGenerator.areaCode.put("山海关区", 130303);
            IdCardGenerator.areaCode.put("昌黎县", 130322);
            IdCardGenerator.areaCode.put("抚宁县", 130323);
            IdCardGenerator.areaCode.put("卢龙县", 130324);
            IdCardGenerator.areaCode.put("邯郸市", 130400);
            IdCardGenerator.areaCode.put("市辖区", 130401);
            IdCardGenerator.areaCode.put("邯山区", 130402);
            IdCardGenerator.areaCode.put("丛台区", 130403);
            IdCardGenerator.areaCode.put("复兴区", 130404);
            IdCardGenerator.areaCode.put("峰峰矿区", 130406);
            IdCardGenerator.areaCode.put("邯郸县", 130421);
            IdCardGenerator.areaCode.put("临漳县", 130423);
            IdCardGenerator.areaCode.put("成安县", 130424);
            IdCardGenerator.areaCode.put("大名县", 130425);
            IdCardGenerator.areaCode.put("涉　县", 130426);
            IdCardGenerator.areaCode.put("磁　县", 130427);
            IdCardGenerator.areaCode.put("肥乡县", 130428);
            IdCardGenerator.areaCode.put("永年县", 130429);
            IdCardGenerator.areaCode.put("邱　县", 130430);
            IdCardGenerator.areaCode.put("鸡泽县", 130431);
            IdCardGenerator.areaCode.put("广平县", 130432);
            IdCardGenerator.areaCode.put("馆陶县", 130433);
            IdCardGenerator.areaCode.put("魏　县", 130434);
            IdCardGenerator.areaCode.put("曲周县", 130435);
            IdCardGenerator.areaCode.put("武安市", 130481);
            IdCardGenerator.areaCode.put("邢台市", 130500);
            IdCardGenerator.areaCode.put("市辖区", 130501);
            IdCardGenerator.areaCode.put("桥东区", 130502);
            IdCardGenerator.areaCode.put("桥西区", 130503);
            IdCardGenerator.areaCode.put("邢台县", 130521);
        }

        public String generate() {
            StringBuilder generater = new StringBuilder();
            generater.append(this.randomAreaCode());
            generater.append(this.randomBirthday());
            generater.append(this.randomCode());
            generater.append(this.calcTrailingNumber(generater.toString().toCharArray()));
            return generater.toString();
        }

        public int randomAreaCode() {
            int index = (int) (Math.random() * IdCardGenerator.areaCode.size());
            Collection<Integer> values = IdCardGenerator.areaCode.values();
            Iterator<Integer> it = values.iterator();
            int i = 0;
            int code = 0;
            while (i < index && it.hasNext()) {
                i++;
                code = it.next();
            }
            return code;
        }

        public String randomBirthday() {
            Calendar birthday = Calendar.getInstance();
            birthday.set(Calendar.YEAR, (int) (Math.random() * 60) + 1950);
            birthday.set(Calendar.MONTH, (int) (Math.random() * 12));
            birthday.set(Calendar.DATE, (int) (Math.random() * 31));

            StringBuilder builder = new StringBuilder();
            builder.append(birthday.get(Calendar.YEAR));
            long month = birthday.get(Calendar.MONTH) + 1;
            if (month < 10) {
                builder.append("0");
            }
            builder.append(month);
            long date = birthday.get(Calendar.DATE);
            if (date < 10) {
                builder.append("0");
            }
            builder.append(date);
            return builder.toString();
        }

        /*
     * <p>18位身份证验证</p>
     * 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。
     * 排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
     * 第十八位数字(校验码)的计算方法为：
     * 1.将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2
     * 2.将这17位数字和系数相乘的结果相加。
     * 3.用加出来和除以11，看余数是多少？
     * 4.余数只可能有0 1 2 3 4 5 6 7 8 9 10这11个数字。其分别对应的最后一位身份证的号码为1 0 X 9 8 7 6 5 4 3 2。
     * 5.通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。如果余数是10，身份证的最后一位号码就是2。
     */
        public char calcTrailingNumber(char[] chars) {
            if (chars.length < 17) {
                return ' ';
            }
            int[] c = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
            char[] r = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
            int[] n = new int[17];
            int result = 0;
            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(chars[i] + "");
            }
            for (int i = 0; i < n.length; i++) {
                result += c[i] * n[i];
            }
            return r[result % 11];
        }

        public String randomCode() {
            int code = (int) (Math.random() * 1000);
            if (code < 10) {
                return "00" + code;
            } else if (code < 100) {
                return "0" + code;
            } else {
                return "" + code;
            }
        }



//        public static void main(String[] args) {
//            IdCardGenerator g = new IdCardGenerator();
//            String card = g.generate();
//
//            System.out.print(card);
//        }
    }
}