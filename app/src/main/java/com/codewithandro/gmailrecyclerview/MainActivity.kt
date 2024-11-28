package com.codewithandro.gmailrecyclerview

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    // arrayList Declere type of data class
    lateinit var gmailArrayList: ArrayList<gmailData>

    //recyclerView decleare
    lateinit var myRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //intilaze array class
        gmailArrayList = arrayListOf<gmailData>()

        //find and intilize recyclerView
        myRecyclerView = findViewById(R.id.gmailRVId)

        //creaet data

        val uname = arrayOf(
            "Rahul Sharma",
            "Stack Overflow",
            "Infosys",
            "IIT Bombay",
            "Generative AI Daily Newsletter",
            "LeetCode",
            "Akash Pawar",
            "Infotech Prodigy",
            "Akhilesh Sharma",
            "Google",
            "AlphaSoft",
            "CodeChife",
            "Microsoft",
            "ISP Team from Internshala",


            )
        val fTitle = arrayOf(
            "Keep The Momentum Going - Your Next Go...",
            "Issue 249 : Software built through pro...",
            "Infosys Springbord Pragati: Path to Fu...",
            "IIT Bombay | Invitation to Attend Tech...",
            "AI Updates: Meta,Microsoft Anthropic In...",
            "LeetCode Weekly Digest",
            "Keep The Momentum Going - Your Next Go...",
            "Prajwal, you're in! unlock exclusive op...",
            "Nice Work Prajwal Keep Going",
            "Google Cloud Internship| Invitation to Attend Tech...",
            "Hi Prajwal,Invitation to Join Internship... ",
            "CodeChife Daily Digest",
            "Make plans in Microsoft Teams",
            "Congratulation, Prajwal You Are Selected T.."
        )

        val uImg = arrayOf(
            R.drawable.it,
            R.drawable.baseline_account_circle_24,
            R.drawable.info,
            R.drawable.i12,
            R.drawable.i13,
            R.drawable.th,
            R.drawable.i15,
            R.drawable.i16,
            R.drawable.i17,
            R.drawable.search,
            R.drawable.alps,
            R.drawable.cod,
            R.drawable.mic,
            R.drawable.isp
            )

        val gmailDate = arrayOf(
            "Oct 29",
            "Oct 25",
            "Oct 20",
            "Oct 5",
            "Sep 30",
            "Sep 23",
            "Sep 19",
            "Aug 15",
            "Aug 14",
            "Aug 6",
            "Jul 28",
            "Feb 23",
            "Jan 31",
            "Jan 1",
        )

        val gmailCon = arrayOf(
            "Subject: Keep The Momentum Going - Your Journey as an Android Developer" +
                    "Hi Prajwal,\n" +
                    "\n" +
                    "I hope this message finds you well. I just wanted to take a moment to recognize the progress you've made in your journey as an Android developer. It’s been impressive to see your dedication and growth in this field.\n" +
                    "\n" +
                    "As you continue to study and refine your skills, remember that consistency is key. Keep pushing forward, learning new techniques, and applying what you learn in practical ways. The field of Android development is constantly evolving, and your commitment to staying up-to-date is what will set you apart.\n" +
                    "\n" +
                    "If there’s anything I can help you with or any specific area you'd like advice on, feel free to reach out.\n" +
                    "\n" +
                    "Keep up the great work, and let’s keep the momentum going!\n" +
                    "\n" +
                    "Best,\n" +
                    "Rahul Sharma",


            "Subject: Issue 249: Software Built Through Project - Assistance Needed\n" +
                    "\n" +
                    "Dear Stack Overflow Support Team,\n" +
                    "\n" +
                    "I am writing to request assistance with Issue 249, which pertains to a problem with software built through our current project. Here are the specifics:\n" +
                    "\n" +
                    "Problem Description: We’re encountering [specific issue details, like \"unexpected crashes during runtime\" or \"compilation errors\"]. The issue has persisted despite multiple troubleshooting attempts.\n" +
                    "\n" +
                    "Troubleshooting Steps Taken: We have attempted [steps like \"debugging\", \"updating dependencies\", \"rebuilding modules\", etc.], but the issue remains unresolved.\n" +
                    "\n" +
                    "Environment Details: The software is being developed on [Operating System], using [IDE/Development Tools, relevant libraries or frameworks, etc.].\n" +
                    "\n" +
                    "If you could guide us toward a solution, or provide relevant documentation or resources, it would be greatly appreciated.\n" +
                    "\n" +
                    "Thank you for your time and assistance.",

            "Subject: Infosys Springboard Pragati: Path to Future\n" +
                    "\n" +
                    "Dear Prajwal,\n" +
                    "\n" +
                    "I hope you are doing well. We are excited to inform you about Infosys Springboard Pragati, a program designed to shape your path to future success. This initiative provides a curated learning experience to help you strengthen your skills, build new ones, and explore various career pathways with Infosys.\n" +
                    "\n" +
                    "Springboard Pragati offers access to resources, tools, and mentorship opportunities tailored to guide you in your professional journey. By participating, you'll gain exposure to industry insights and hands-on projects that will enhance your expertise and prepare you for upcoming challenges in the tech world.\n" +
                    "\n" +
                    "Take advantage of this opportunity to advance your career and prepare for what’s ahead. We look forward to seeing you make the most of it!\n" +
                    "\n" +
                    "Best regards,\n" +
                    "[Prajwal Jaybhaye]\n" +
                    "Infosys Team\n" +
                    "\n",

            "Subject: IIT Bombay | Invitation to Attend Tech Event\n" +
                    "\n" +
                    "Dear Prajwal,\n" +
                    "\n" +
                    "We are thrilled to extend a special invitation for you to attend an upcoming tech event at IIT Bombay! This event will gather industry leaders, innovators, and tech enthusiasts to dive into the latest advancements and explore the future of technology.\n" +
                    "\n" +
                    "Event Details:\n" +
                    "\n" +
                    "Date: [Event Date]\n" +
                    "Time: [Event Time]\n" +
                    "Venue: [Location or online link if it’s virtual]\n" +
                    "Topics: Cutting-edge topics such as Artificial Intelligence, Machine Learning, Blockchain, and more.\n" +
                    "This is a fantastic opportunity to deepen your knowledge, engage in insightful discussions, and network with top professionals and peers in the tech community. Your passion for technology will make your participation both impactful and enjoyable.\n" +
                    "\n" +
                    "Please confirm your attendance by [RSVP Date]. If you have any questions, feel free to reach out.\n" +
                    "\n" +
                    "Looking forward to welcoming you to IIT Bombay's tech event!\n" +
                    "\n" +
                    "Best regards,\n" +
                    "[Your Full Name]\n" +
                    "[Your Position, if applicable]\n" +
                    "IIT Bombay Event Team",
            "gmail 5",
            "gmail 6",
            "gmail 7",
            "gmail 8",
            "gmail 9",
            "Subject: Google Cloud Internship | Invitation to Attend Tech Event\n" +
                    "\n" +
                    "Dear Prajwal,\n" +
                    "\n" +
                    "We are excited to invite you to an upcoming tech event focused on the Google Cloud Internship program! This event will provide valuable insights into the internship opportunities available at Google Cloud and how you can make the most of your experience.\n" +
                    "\n" +
                    "Event Details:\n" +
                    "\n" +
                    "Date: 20-11-2024\n" +
                    "Time: [Event Time]\n" +
                    "Venue: [Location or online link if virtual]\n" +
                    "Agenda:\n" +
                    "Overview of Google Cloud and its technologies\n" +
                    "Insights into the internship program\n" +
                    "Tips for application and interview success\n" +
                    "Q&A session with current interns and mentors\n" +
                    "This is a fantastic opportunity for you to learn more about the Google Cloud ecosystem, network with professionals, and enhance your skills. We believe your enthusiasm for technology will make your participation especially valuable.\n" +
                    "\n" +
                    "Please let us know if you can join us by [RSVP Date]. If you have any questions or need further information, feel free to reach out.\n" +
                    "\n" +
                    "We look forward to seeing you at the event!\n" +
                    "\n" +
                    "Best regards,\n" +
                    "[Your Full Name]\n" +
                    "[Your Position, if applicable]\n" +
                    "Google Cloud Team",

            "gmail 11",
            "gmail 12",
            "gmail 13",
            "gmail 14",

        )

        //layout manager hav-bhav linerLayoutManager pass context
        myRecyclerView.layoutManager = LinearLayoutManager(this)

        //insert data into arrayList using for loop
        for(idx in uname.indices){
            val uData = gmailData(uname[idx],fTitle[idx],uImg[idx],gmailDate[idx],gmailCon[idx])
            //insert Data
            gmailArrayList.add(uData)
        }
        //data ready create adapter

        //creaet the adapter var
        val myAdapter = GmailAdapter(gmailArrayList,this)//create adapter pass the data and context
        myRecyclerView.adapter =myAdapter

        //interface itemAction call pass-> object
        myAdapter.setItemClickListner(object  : GmailAdapter.onItemClickListner{
            override fun onItemClicking(position: Int) {
                //on clicking perform some action

                //intent sent data one activity to another

                val gmailIntent = Intent(applicationContext,gmailContent::class.java)
                gmailIntent.putExtra("userName",gmailArrayList[position].userName)
                gmailIntent.putExtra("gmailTitle",gmailArrayList[position].gmailTitle)
                gmailIntent.putExtra("userImg",gmailArrayList[position].userImg)
                gmailIntent.putExtra("gmCon",gmailArrayList[position].gmailCon)

                startActivity(gmailIntent)
                //send the data
            }

        })



    }
}